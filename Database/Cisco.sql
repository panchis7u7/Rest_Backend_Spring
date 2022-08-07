-- sudo docker run --name postgres-alpine -e POSTGRES_USER=cisco -e POSTGRES_PASSWORD=cisco -e POSTGRES_DB=cisco -p 5432:5432 -d postgres:14.4-alpine
-- cat Cisco.sql | sudo docker exec -i postgres-alpine psql -U cisco cisco

CREATE TABLE IF NOT EXISTS cisco_graduates (
    id UUID PRIMARY KEY NOT NULL,
    firstName VARCHAR(20) NOT NULL,
    lastName VARCHAR(30) NOT NULL,
    cecid VARCHAR(12) NOT NULL,
    technology VARCHAR(20)
);