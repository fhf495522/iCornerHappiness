CREATE TABLE corner.tblsitecontent
(
    content VARCHAR(20) NOT NULL,
    contenttype VARCHAR(20) NOT NULL,
    contentorder INT NOT NULL,
    value VARCHAR(1000) NOT NULL,
    PRIMARY KEY (content, contenttype, contentorder)
);