package edu.fiu.hmts.domain;

public class OrderProduct {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.orderproduct_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    private Integer orderproductId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.product_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.name
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.type
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.price
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.brief
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    private String brief;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.order_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    private long orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.orderproduct_id
     *
     * @return the value of orderproduct.orderproduct_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public Integer getOrderproductId() {
        return orderproductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.orderproduct_id
     *
     * @param orderproductId the value for orderproduct.orderproduct_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public void setOrderproductId(Integer orderproductId) {
        this.orderproductId = orderproductId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.product_id
     *
     * @return the value of orderproduct.product_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.product_id
     *
     * @param productId the value for orderproduct.product_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.name
     *
     * @return the value of orderproduct.name
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.name
     *
     * @param name the value for orderproduct.name
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.type
     *
     * @return the value of orderproduct.type
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.type
     *
     * @param type the value for orderproduct.type
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.price
     *
     * @return the value of orderproduct.price
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.price
     *
     * @param price the value for orderproduct.price
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.brief
     *
     * @return the value of orderproduct.brief
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.brief
     *
     * @param brief the value for orderproduct.brief
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.order_id
     *
     * @return the value of orderproduct.order_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.order_id
     *
     * @param orderId2 the value for orderproduct.order_id
     *
     * @mbggenerated Tue Apr 05 20:49:24 EDT 2016
     */
    public void setOrderId(long orderId2) {
        this.orderId = orderId2;
    }
}