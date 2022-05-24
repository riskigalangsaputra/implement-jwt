package com.riskigalang.implementjwt.configuration;

import com.riskigalang.implementjwt.dao.MasterAccountModel;
import com.riskigalang.implementjwt.repository.MasterAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @author galang
 */
@Component
public class JwtBillerProviderDetailsService implements UserDetailsService {

    @Autowired
    private MasterAccountRepository masterAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MasterAccountModel masterAccount = masterAccountRepository.findByUsername(username);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        return new org.springframework.security.core.userdetails.User(masterAccount.getUsername(), masterAccount.getPassword(), grantedAuthorities);
    }
}
