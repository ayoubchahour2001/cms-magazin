
-- data.sql example
INSERT INTO Suppliers (name_supplier, country) VALUES ('Supplier A', 'US');
INSERT INTO Products (type_product, name_product, price_product, dimension, color) 
VALUES ('Chair', 'Comfort Chair', 99.99, '50x50x100', 'Red');
INSERT INTO Purchases (id_product, id_supplier, purchase_price, purchase_date) 
VALUES (1, 1, 80.00, '2026-03-30');