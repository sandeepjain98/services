Feature: GET Product Endpoint
  as a PO
  I want GET PRoduct Endpoint to Return response

  Scenario: get Product
    Given product Number is 1234 and someOne calls getProduct
    Then product details should be as follows
    | description | uuid | number|
    |  Product Description:1 | 1       | 1234|