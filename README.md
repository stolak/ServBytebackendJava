# ServBytebackendJava
Backend for the online service using Java
By default the application will run on server.port=8089 as set in the application property
Eg http://localhost:8089

The following data are pre-loaded into the database
INSERT INTO Category VALUES(1, 'Food');
INSERT INTO Category VALUES(2, 'laundry');
INSERT INTO Category VALUES(3, 'pharmacy');
INSERT INTO Category VALUES(4, 'grocery');


INSERT INTO City VALUES(1, 'Abuja');
INSERT INTO City VALUES(2, 'Lagos');
INSERT INTO City VALUES(3, 'Ibadan');
INSERT INTO City VALUES(4, 'Uyo');
INSERT INTO City VALUES(5, 'Port Harcourt');
INSERT INTO City VALUES(6, 'Enugu');
INSERT INTO City VALUES(7, 'Asaba');
INSERT INTO City VALUES(8, 'Kano');
INSERT INTO City VALUES(9, 'Umuahia');
INSERT INTO City VALUES(10, 'Onitsha');
INSERT INTO City VALUES(11, 'Aba');
INSERT INTO City VALUES(12, 'Owerri');

INSERT INTO ITEMS VALUES(1, '1','Semovita','/1.jpg','30mins','5500','1'); 
INSERT INTO ITEMS VALUES(2, '1','Rice and Beans','/2.jpg','45mins','7500','1'); 
INSERT INTO ITEMS VALUES(3, '1','Amala and Gbegiri','/3.jpg','5mins','6500','1'); 

INSERT INTO SERVICE_PROVIDERS VALUES(1, '1','stephen@gmail.com','2.jpg','Stephen Delicious food','08032196222');

INSERT INTO SERVICE_PROVIDERS VALUES(2, '1','akinbobola@gmail.com','2.jpg', 'Unbeatable Restuarant','08032196222');





API path
/api/categories # Fetches all the product category


/api/city # fetches all the city

/api/serviceprovider  # fetches all the service providers

/api/item-list  #fetches all the service or product available

/api/item-list/{id}  # fetches a particular detail of the service or product with ‘id’ being the primary id of the item



