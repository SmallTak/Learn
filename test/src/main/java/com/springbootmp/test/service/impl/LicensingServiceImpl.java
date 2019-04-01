package com.springbootmp.test.service.impl;

import com.springbootmp.test.entity.Licensing;
import com.springbootmp.test.mapper.LicensingMapper;
import com.springbootmp.test.service.LicensingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicensingServiceImpl implements LicensingService {

    @Autowired
    private LicensingMapper licensingMapper;

    @Override
    public void update() {

        List<Licensing> licensings = licensingMapper.selectList(null);

        for (Licensing licensing : licensings) {
            String XKJGDM = licensing.getXkXkjgdm();

            if (XKJGDM == null || XKJGDM.isEmpty()){
                licensing.setXkXkjgdm(licensing.getXkLydwdm());
                licensingMapper.updateById(licensing);
            }

        }

    }

}
