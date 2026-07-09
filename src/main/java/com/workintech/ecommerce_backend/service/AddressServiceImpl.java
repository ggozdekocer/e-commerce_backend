package com.workintech.ecommerce_backend.service;

import com.workintech.ecommerce_backend.entity.Address;
import com.workintech.ecommerce_backend.entity.User;
import com.workintech.ecommerce_backend.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements IAddressService {

    private final AddressRepository addressRepository;

    @Override
    public List<Address> getAllByUser(User user) {
        return addressRepository.findByUserId(user.getId());
    }

    @Override
    public Address save(User user, Address address) {
        address.setUser(user);
        return addressRepository.save(address);
    }

    @Override
    public void delete(User user, Long id) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Address not found"));
        if (!address.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized");
        }
        addressRepository.delete(address);
    }
}