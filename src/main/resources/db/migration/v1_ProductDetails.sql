CREATE TABLE IF NOT EXISTS productDetails
(
    id                  INTEGER NOT NULL PRIMARY KEY,
    productName         VARCHAR(50) NOT NULL,
    FOREIGN Key(auctionedBy)  REFERENCES auctioneerDetails(id),
    productCategory     VARCHAR(50) NOT NULL,
    productOpeningValue INTEGER NOT NULL,
    shortDescription    VARCHAR(200) NOT NULL
);