package com.lpg.app.product.management.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    @Autowired
    public DatabaseLoader(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        loadProductData();
        loadCategoryData();
    }

    private void loadProductData() {
        Product product = new Product("Knife Set",
                "A set of knives in all shapes and sizes.",1l);
        product.setCreationDate("9/20/2020 0:01");
        product.setUpdateDate("9/20/2020 0:01");
        product.setLastPurchasedDate("10/24/2020 0:01");
        log.info("Preloading " + productRepository.save(product));

        Product product2 = new Product("Plate Rack",
                "A storage solution for plates.",1l);
        product2.setCreationDate("9/20/2020 0:01");
        product2.setUpdateDate("9/20/2020 0:01");
        product2.setLastPurchasedDate("10/19/2020 0:01");
        log.info("Preloading " + productRepository.save(product2));

        Product product3 = new Product("Power Drill",
                "A drill, but with an electric motor.",2l);
        product3.setCreationDate("9/20/2020 0:01");
        product3.setUpdateDate("9/20/2020 0:01");
        product3.setLastPurchasedDate("10/28/2020 0:01");
        log.info("Preloading " + productRepository.save(product3));

        Product product4 = new Product("Microwave",
                "Cook food quick with this handy microwave.",2l);
        product4.setCreationDate("9/20/2020 0:01");
        product4.setUpdateDate("9/20/2020 0:01");
        product4.setLastPurchasedDate("10/24/2020 0:01");
        log.info("Preloading " + productRepository.save(product4));

        Product product5 = new Product("Juicer",
                "When life gives you lemons, make lemonade.",1l);
        product5.setCreationDate("9/20/2020 0:01");
        product5.setUpdateDate("9/20/2020 0:01");
        product5.setLastPurchasedDate("10/24/2020 0:01");
        log.info("Preloading " + productRepository.save(product5));

        Product product6 = new Product("5 Chest Drawer",
                "So many drawers.",3l);
        product6.setCreationDate("9/20/2020 0:01");
        product6.setUpdateDate("9/20/2020 0:01");
        product6.setLastPurchasedDate("10/24/2020 0:01");
        log.info("Preloading " + productRepository.save(product6));
    }

    private void loadCategoryData() {
        Category category = new Category("Kitchen");
        log.info("Preloading " + categoryRepository.save(category));

        Category category2 = new Category("Power Tools");
        log.info("Preloading " + categoryRepository.save(category2));

        Category category3 = new Category("Furniture");
        log.info("Preloading " + categoryRepository.save(category3));

        Category category4 = new Category("Electric");
        log.info("Preloading " + categoryRepository.save(category4));

        Category category5 = new Category("Washroom");
        log.info("Preloading " + categoryRepository.save(category5));

        Category category6 = new Category("Textiles");
        log.info("Preloading " + categoryRepository.save(category6));

        Category category7 = new Category("Misc.");
        log.info("Preloading " + categoryRepository.save(category7));
    }

}
