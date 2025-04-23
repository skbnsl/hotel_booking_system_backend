package com.example.HotelBooking.security;

import com.example.HotelBooking.entities.User;
import com.example.HotelBooking.exceptions.NotFoundException;
import com.example.HotelBooking.repositories.UserRepository;
import com.stripe.param.issuing.AuthorizationIncrementParams;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username).orElseThrow(()-> new NotFoundException("user email not found"));
        return AuthUser.builder()
                .user(user)
                .build();
    }
}
