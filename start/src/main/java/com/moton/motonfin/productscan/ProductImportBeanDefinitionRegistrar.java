package com.moton.motonfin.productscan;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author daiweihang
 * @date 2022/8/7
 */
public class ProductImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        ProductClassBeanDefinitionScanner scanner = new ProductClassBeanDefinitionScanner(registry, false);
        scanner.registerDefaultFilters();
        scanner.doScan("com.moton");

    }
}
