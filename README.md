# java zero copy test

## 测试数据

| 文件大小        | 传统IO copy时间  | Zero Copy 时间 |
| ------------- |:-------------:| :---------------|
| 1M     | 26ms | 15ms　
| 2M     | 26ms | 6ms　
| 4M     | 60ms | 12ms　
| 6M     | 76ms | 10ms　
| 12M    | 190ms| 24ms　
| 24M    | 353ms| 29ms　
| 49M     | 560ms| 89ms　