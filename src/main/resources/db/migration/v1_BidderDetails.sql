CREATE TABLE IF NOT EXISTS bidderDetails
(
    id          INTEGER NOT NULL PRIMARY KEY,
    firstName   VARCHAR(50) NOT NULL,
    lastName    VARCHAR(50) NOT NULL,
    phone       INT NOT NULL,
    email       VARCHAR(50) NOT NULL,
    verified    BIT NOT NULL,
    country     VARCHAR(50) NOT NULL,
    state       VARCHAR(50) NOT NULL,
    city        VARCHAR(50) NOT NULL,
    code        INTEGER NOT NULL,
    verified    BIT NOT NULL
);