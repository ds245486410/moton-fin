package com.moton.motonfin.productscan;

import com.moton.motonfin.api.base.Product;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;

/**
 * @author daiweihang
 * @date 2022/8/7
 */
public class ProductClassBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {
    public ProductClassBeanDefinitionScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
        super(registry, useDefaultFilters);
    }

    @Override
    protected void registerDefaultFilters() {
        addIncludeFilter(new AnnotationTypeFilter(Product.class));
    }

    @Override
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
        return super.doScan(basePackages);
    }
}
