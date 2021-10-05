create table products
(
    id          bigserial primary key,
    title       varchar(255),
    price       int,
    information varchar (255),
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp
);

insert into products (title, price, information)
values ('Хлеб', 25, 'Производитель: Хлебный дом'),
       ('Молоко', 80, 'Жирность: 2.5%'),
       ('Сыр', 450, 'Жирность 45%');
