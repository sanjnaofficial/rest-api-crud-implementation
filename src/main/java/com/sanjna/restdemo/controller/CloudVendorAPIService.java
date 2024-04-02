package com.sanjna.restdemo.controller;

import com.sanjna.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

//cloud vendor REST API CRUD Implementation
//tested using Postman tool
@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;

    //get request: getting all the details with vendorId
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
//        return new CloudVendor("C1","Vendor 1","Address 1","xxxxxx");
    }

    //post request: creating a cloud vendor by adding a json in request body
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Created Successfully.";
    }

    //put request: for updating the details by adding an updated json in request body
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor updated Successfully";
    }

    //delete request: for deleting the details of a vendorId
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor=null;
        return "Cloud Vendor deleted Successfully";
    }
}
