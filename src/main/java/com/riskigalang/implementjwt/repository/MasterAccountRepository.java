package com.riskigalang.implementjwt.repository;

import com.riskigalang.implementjwt.dao.MasterAccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author galang
 */
@Repository
public interface MasterAccountRepository extends JpaRepository<MasterAccountModel, Long> {
    MasterAccountModel findByUsername(String username);
}
