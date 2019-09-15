create table payment
(
  id integer not null,
  account_number varchar(250) not null,
  name varchar(250),
  transaction_details  varchar(250),
  amount integer,
  primary key(id)
);