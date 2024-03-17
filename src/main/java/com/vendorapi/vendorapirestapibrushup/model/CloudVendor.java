package com.vendorapi.vendorapirestapibrushup.model;

public class CloudVendor {
    private  String vendorId;
    private  String vendorName;
    private String vendorAddress;
    private String getVendorPhoneNumber;

    public CloudVendor() {

    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String getVendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.getVendorPhoneNumber = getVendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getGetVendorPhoneNumber() {
        return getVendorPhoneNumber;
    }

    public void setGetVendorPhoneNumber(String getVendorPhoneNumber) {
        this.getVendorPhoneNumber = getVendorPhoneNumber;
    }
}
