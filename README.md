# java zero copy test

## 测试数据(数据不是很准确，反应一个基本情况)

| 文件大小        | 传统IO copy时间  | Zero Copy 时间 |
| ------------- |:-------------:| :---------------|
| 1M     | 24ms | 15ms　
| 2M     | 30ms | 7ms　
| 4M     | 70ms | 12ms　
| 5M     | 81ms | 12ms　
| 11M    | 192ms| 23ms　
| 23M    | 384ms| 64ms　
| 47M     | 598ms| 61ms　