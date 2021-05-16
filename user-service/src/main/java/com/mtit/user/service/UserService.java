package com.mtit.user.service;

import com.mtit.user.VO.Product;
import com.mtit.user.VO.ResponseTemplateVO;
import com.mtit.user.entity.User;
import com.mtit.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithProduct(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Product product =
                restTemplate.getForObject("http://PRODUCT-SERVICE/products/" + user.getProductId() ,Product.class);
        vo.setUser(user);
        vo.setProduct(product);

        return vo;
    }
}
