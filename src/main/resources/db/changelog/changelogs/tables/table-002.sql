CREATE TABLE if not exists supplier_offers (
     id BIGSERIAL PRIMARY KEY,
     request_id BIGINT NOT NULL,
     supplier_id BIGINT NOT NULL,
     status VARCHAR(30) NOT NULL DEFAULT 'PENDING',
     inspection_score INTEGER,
     car_details TEXT NOT NULL,
     price NUMERIC(15, 2) NOT NULL,
     created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
     CONSTRAINT fk_offer_request FOREIGN KEY (request_id) REFERENCES customer_requests(id) ON DELETE CASCADE
);