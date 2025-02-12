package com.tns.ifet.shopingmall.customer.reposteriay;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.ifet.shopingmall.customer.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
}
