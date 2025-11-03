### JOBSHEET 8

## Percobaan 1 : Pertanyaan

1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?

Program akan mencetak jumlah bintang sebanyak N + 1 kali. karena Ketika i = 0, perulangan berjalan untuk nilai i = 0 sampai i = N → total N + 1 kali (karena dimulai dari 0).

2. Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa bisa demikian?

Program tidak akan mencetak apa-apa. kerana Kondisi i > N berarti perulangan hanya akan berjalan jika nilai i lebih besar dari N.

3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?

Program akan berjalan tanpa henti (infinite loop). kerena i-- menurunkan nilai i setiap iterasi, nilai i akan menjadi 0, -1, -2, dst yang tidak mungkin menjadi yang lebig besar dari input.


