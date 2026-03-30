-- Table for suppliers
CREATE TABLE Suppliers (
    id_supplier SERIAL PRIMARY KEY,
    name_supplier VARCHAR(255) NOT NULL,
    country VARCHAR(100) DEFAULT 'US'
);

-- Table for products
CREATE TABLE Products (
    id_product SERIAL PRIMARY KEY,
    type_product VARCHAR(100) NOT NULL,
    name_product VARCHAR(255) NOT NULL,
    price_product DECIMAL(10,2) NOT NULL,
    dimension VARCHAR(100),
    color VARCHAR(50)
);

-- Table for purchase info
CREATE TABLE Purchases (
    id_purchase SERIAL PRIMARY KEY,
    id_product INT NOT NULL,
    id_supplier INT NOT NULL,
    purchase_price DECIMAL(10,2) NOT NULL,
    purchase_date DATE NOT NULL,
    FOREIGN KEY (id_product) REFERENCES Products(id_product),
    FOREIGN KEY (id_supplier) REFERENCES Suppliers(id_supplier)
);

-- Optional: Indexes for optimization
CREATE INDEX idx_product_type ON Products(type_product);
CREATE INDEX idx_product_name ON Products(name_product);
CREATE INDEX idx_purchase_date ON Purchases(purchase_date);
