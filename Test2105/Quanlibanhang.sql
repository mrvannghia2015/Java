create database QUANLIBANHANG
use QUANLIBANHANG

create table Khach
(
Makhach varchar(10) NOT NULL,
Tenkhach nvarchar(50) NOT NULL,
Diachi nvarchar(50) NOT NULL,
Dienthoai nvarchar(12) NOT NULL,
primary key (Makhach)
)

create table HDBan
(
MaHDBan varchar(10) NOT NULL,
Manhanvien varchar(10) NOT NULL,
Ngayban datetime NOT NULL,
Makhach varchar(10) NOT NULL,
Tongtien float NOT NULL,
primary key (MaHDBan)
)

create table ChitietHDBan
(
MaHDBan varchar(10) NOT NULL,
Mahang varchar(10) NOT NULL,
Soluong float NOT NULL,
Dongia float NOT NULL,
Giamgia float,
Thanhtien float NOT NULL,
primary key(MaHDBan,Mahang)
)

create table Hang
(
Mahang varchar(10) NOT NULL,
Tenhang nvarchar(30) NOT NULL,
Machatlieu varchar(10) NOT NULL,
Soluong float NOT NULL,
Dongianhap float NOT NULL,
Dongiaban float NOT NULL,
Anh nvarchar(200),
Ghichu nvarchar(200),
primary key(Mahang)
)

create table Nhanvien
(
Manhanvien varchar(10) NOT NULL,
Tennhanvien nvarchar(30) NOT NULL,
Gioitinh bit NOT NULL,
Diachi nvarchar(50) NOT NULL,
Dienthoai varchar(12) NOT NULL,
Ngaysinh datetime NOT NULL, 
primary key(Manhanvien)
)

create table Chatlieu
(
Machatlieu varchar(10) NOT NULL,
Tenchatlieu nvarchar(30) NOT NULL,
primary key(Machatlieu)
)

alter table HDBan add constraint fk_mnv foreign key(Manhanvien) references Nhanvien(Manhanvien) 
alter table HDBan add constraint fk_mk foreign key (Makhach) references Khach(Makhach) 
alter table ChitietHDBan add constraint fk_mhdb foreign key(MaHDBan) references HDBan(MaHDBan) 
alter table ChitietHDBan add constraint fk_mh foreign key(Mahang) references Hang(Mahang) 
alter table Hang add constraint fk_mcl foreign key(Machatlieu) references Chatlieu(Machatlieu) 



