To test your API using Postman, you need to prepare both POST and GET requests. Below are the details for each type of request:

1. Steps in Postman:
  Select POST from the dropdown.
  Enter http://localhost:8080/api/supplier in the URL field.
  Go to the Headers tab and ensure Content-Type is set to application/json.
  Go to the Body tab, select raw and choose JSON from the dropdown.
  Paste the JSON data into the body field.
  Click Send to make the request.
  
  URL:http://localhost:8080/api/supplier
  Method: POST
  Headers: Content-Type: application/json
  Body (raw JSON):
  {
    "companyName": "Makersharks Ltd.",
    "website": "http://makersharks.com",
    "location": "India",
    "natureOfBusiness": "small_scale",
    "manufacturingProcesses": ["3d_printing", "laser_cutting"]
  }
  
2. Steps in Postman:
  Select GET from the dropdown.
  Enter http://localhost:8080/api/supplier/query?location=India&natureOfBusiness=small_scale&manufacturingProcess=3d_printing&limit=10 in the URL field.
  Click Send to make the request.

  URL:http://localhost:8080/api/supplier/query?location=India&natureOfBusiness=small_scale&manufacturingProcess=3d_printing&limit=10
  Method: GET
