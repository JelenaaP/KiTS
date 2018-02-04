set foreign_key_checks = 0;

set foreign_key_checks = 1;

insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Janko', 'janko', 'admin', 'ADMIN');
insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Marko', 'marko', 'admin', 'USER');
insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Marija', 'marija', 'admin', 'USER');
insert into korisnik_servisa (ime, koris_ime, lozinka, uloga) values ('Mirjana', 'mirjana', 'admin', 'USER');

insert into firma (adresa,email, ime, telefon, web_site, vlasnik_id) values ('adresa1', 'firma1@gmail.com', 'firma1', 015555333, 'www.firma1.com',1);
insert into firma (adresa,email, ime, telefon, web_site, vlasnik_id) values ('adresa2', 'firma2@gmail.com', 'firma2', 015333555, 'www.firma2.com',2);

insert into zgrada (adresa, br_naseljenih, br_stanova, ime, vlasnik_id) values ('Loznica', 5, 8, 'zgrada 1', 2);

insert into kvar (dat_kreiranja, dat_popravke, dat_zakazivanja, ime, opis, popravljen, kreator_id,zgrada_id)
values ('05.01.2018', '06.01.2018', '05.01.2018','kvar1', 'opis kvara1', 1,1,1);

insert into komentar (dat_kreiranja, text, kreator_id, kvar_id) values ('21.12.2017', 'ovo je tekst komentara',3,1);
insert into komentar (dat_kreiranja, text, kreator_id, kvar_id) values ('22.12.2017', 'ovo je takodje komentar',4,1);

insert into obavestenje (dat_kreiranja, ime, opis, kreator_id, zgrada_id) values ('01.01.2018' , 'obavestenje1' , 'opis obavestenja1',1,1);

insert into sednica (aktivna, dat_kreiranja, dat_zakazivanja, kreator_id, zgrada_id) values (0, '05.01.2018','06.01.2018', 1, 1);

insert into stan (adresa, br_stanovnika, ime, vlasnik_id, zgrada_id) values ('adresa 1', 5, 'stan1', 3, 1);

insert into zapisnik (dat_kreiranja, opis, kreator_id, zgrada_id) values ('01.01.2018', 'opis 1', 2, 1);

insert into stavka (dat_kreiranja, ime, opis, kreator_id, sednica_id) values ('2018.01.01', 'stavka1', 'opis stavke', 1, 1);

insert into popravlja (kvar_id, korisnik_servisa_id, firma_id) values (1, 3, 1);

insert into radi (firma_id, korisnik_servisa_id) values (1, 3);