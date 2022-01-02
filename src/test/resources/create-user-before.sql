delete from user_role;
delete from usr;

insert into usr(id, username, password, active) values
                                                    (1, 'admin', '$2a$08$nlHSdId//8RoxTz9w1U1EOWcPGC98muPoK0k7FIzFWRTry42iT1oS', true),
                                                    (2, 'mike', '$2a$08$nlHSdId//8RoxTz9w1U1EOWcPGC98muPoK0k7FIzFWRTry42iT1oS', true);

insert into user_role(user_id, roles) values
                                          (1, 'ADMIN'), (1, 'USER'),
                                          (2, 'USER');