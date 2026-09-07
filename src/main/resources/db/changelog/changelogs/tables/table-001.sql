CREATE TABLE if not exists customer_requests (
        id BIGSERIAL PRIMARY KEY,
        customer_id BIGINT NOT NULL,
        status VARCHAR(30) NOT NULL,
        description TEXT NOT NULL,
        checked_by_company VARCHAR(50) NOT NULL,
        created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
        updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT chk_customer_request_status CHECK (status IN ('ACTIVE', 'CLOSED', 'CANCELLED')),
    CONSTRAINT chk_inspection_company CHECK (checked_by_company IN ('AUTO_CHECK_CO', 'VEHI_VERIFY_INC'))
    );