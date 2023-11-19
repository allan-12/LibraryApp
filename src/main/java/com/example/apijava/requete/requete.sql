CREATE TABLE IF NOT EXISTS Author (
    author_id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    gender CHAR(1)
);
    INSERT INTO Author (name, gender) VALUES
    ('John Doe', 'M'),
    ('Jane Doe', 'F'),
    ('Alice Smith', 'F');


CREATE TABLE IF NOT EXISTS Book (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    author_id INT,
    FOREIGN KEY (author_id) REFERENCES Author(author_id)
);
    INSERT INTO Book (title, author_id) VALUES
    ('The Great Novel', 1),
    ('A Journey Beyond', 2),
    ('Love in the Rain', 3);



CREATE TABLE IF NOT EXISTS Subscribers (
    subscriber_id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    address VARCHAR(255)
);
    INSERT INTO Subscribers (name, address) VALUES
    ('Subscriber1', '123 Main St'),
    ('Subscriber2', '456 Oak Ave'),
    ('Subscriber3', '789 Elm Blvd');
