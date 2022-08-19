package com.moton.motonfin.productscan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author daiweihang
 * @date 2022/8/7
 */
@Configuration
@Import(ProductImportBeanDefinitionRegistrar.class)
public class ProductConfig {
}
