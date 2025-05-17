program HitungTotalBelanja;
uses crt;

var
  jumlahItem, i: integer;
  namaItem: string;
  hargaItem, totalBiaya, subtotal: real;

begin
  clrscr;
  writeln('=== Program Penghitung Total Biaya Belanja ===');
  write('Masukkan jumlah item yang dibeli: ');
  readln(jumlahItem);

  totalBiaya := 0;

  for i := 1 to jumlahItem do
  begin
    writeln;
    writeln('Item ke-', i);
    write('Nama item        : ');
    readln(namaItem);
    write('Harga per item   : ');
    readln(hargaItem);

    if hargaItem < 0 then
    begin
      writeln('Harga tidak boleh negatif. Input diabaikan.');
      continue;
    end;

    subtotal := hargaItem;
    totalBiaya := totalBiaya + subtotal;
  end;

  writeln;
  writeln('Total biaya belanja: Rp', totalBiaya:0:2);
  readln;
end.
