package com.bhagya.practice.Service;

import com.bhagya.practice.Repository.HelloRepository;
import com.bhagya.practice.model.Address;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@Setter
@Getter
public class HelloService {

    private String name;
    private Address address;

    @Autowired
    private HelloRepository helloRepository;

    public void sayHello(){
        System.out.println("Hello" + name + "from" +  address.getCity().getName() + "!!!");
        System.out.println("---------" + helloRepository.greet() + "-----------");
    }

    public void setAddress(Address address) {
    }

    public void setName(String shrikant) {
    }
}
