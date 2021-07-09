package com.example.restservice.controllers;

import com.example.restservice.models.user.Address;
import com.example.restservice.models.user.User;
import com.example.restservice.repository.AddressRepository;
import com.example.restservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AddressController {
    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/address")
    public ResponseEntity<Address> createUser(@RequestBody Address address) {
        try {
            Address _address = addressRepository
                    .save(new Address(address.getAddr_id(), address.getStreet(),
                            address.getPost_office(),address.getUpazila(),address.getDistrict(),
                            address.getDivision()));
            return new ResponseEntity<>(_address, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/address")
    public ResponseEntity<List<Address>> getAllUsers(@RequestParam(required = false) String addr_id) {
        try {
            List<Address> addresses = new ArrayList<Address>();

            if (addr_id == null)
                addressRepository.findAll().forEach(addresses::add);

            if (addresses.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(addresses, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getUserById(@PathVariable("id") long id) {
        Optional<Address> addressData = addressRepository.findById(id);

        if (addressData.isPresent()) {
            return new ResponseEntity<>(addressData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/address/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") long id) {
        try {
            addressRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/address")
    public ResponseEntity<HttpStatus> deleteAllUsers() {
        try {
            addressRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping("/address/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable("id") long id, @RequestBody Address address) {
        Optional<Address> addressData = addressRepository.findById(id);

        if (addressData.isPresent()) {
            Address _address = addressData.get();
            _address.setAddr_id(address.getAddr_id());
            _address.setStreet(address.getStreet());
            _address.setDistrict(_address.getDistrict());
            _address.setUpazila(_address.getUpazila());
            _address.setDivision(_address.getDivision());
            _address.setPost_office(_address.getPost_office());
            return new ResponseEntity<>(addressRepository.save(_address), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
