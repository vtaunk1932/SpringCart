package com.vasu.electronic.store.config;

import com.cloudinary.Cloudinary;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProjectConfig {
    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }
    @Bean
    public Cloudinary getCloudinary() {
        Map config = new HashMap<>();
        config.put("cloud_name", "dcf3vkcsq");
        config.put("api_key", "261867462379345");
        config.put("api_secret", "Ai-Fg2TCC0K4X1yWx_QwzH6RdNc");
        config.put("secure", true);
        return new Cloudinary(config);
    }
}
