package com.sepideh.inheritance.config;

import com.google.common.cache.CacheBuilder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductCacheConfig implements CachingConfigurer {

  public static final String CACHE_BOOK = "cacheBook";
  public static final String CACHE_PEN = "cachePen";

  private static final long CACHE_DURATION = 60; //In Minutes

  private final Logger logger = LoggerFactory.getLogger(ProductCacheConfig.class);

  @Bean
  @Override
  public CacheManager cacheManager() {
    logger.info("Initializing simple Guava Cache manager.");
    SimpleCacheManager cacheManager = new SimpleCacheManager();

    GuavaCache cacheBook = new GuavaCache(CACHE_BOOK, CacheBuilder.newBuilder()
        .expireAfterWrite(CACHE_DURATION, TimeUnit.MINUTES)
        .build());

    GuavaCache cachePen = new GuavaCache(CACHE_PEN, CacheBuilder.newBuilder()
        .expireAfterWrite(CACHE_DURATION, TimeUnit.SECONDS)
        .build());

    cacheManager.setCaches(Arrays.asList(cacheBook, cachePen));

    return cacheManager;
  }

  @Override
  public CacheResolver cacheResolver() {
    return null;
  }

  @Bean
  @Override
  public KeyGenerator keyGenerator() {
    return new SimpleKeyGenerator();
  }

  @Override
  public CacheErrorHandler errorHandler() {
    return null;
  }

}
