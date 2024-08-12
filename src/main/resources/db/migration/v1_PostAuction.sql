CREATE TABLE IF NOT EXISTS postAuction
(
    FOREIGN Key(pId)  REFERENCES productDetails(id) PRIMARY KEY,
    FOREIGN Key(bId)  REFERENCES bidderDetails(id),
);