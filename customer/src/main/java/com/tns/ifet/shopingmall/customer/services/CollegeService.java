package com.tns.ifet.shopingmall.customer.services;



import java.util.List;

import com.tns.ifet.shopingmall.customer.entity.College;

public interface CollegeService {
    College saveCollege(College college);
    List<College> getAllColleges();
    College getCollegeById(Long id);
    College updateCollege(Long id, College collegeDetails);
    void deleteCollege(Long id);
}

