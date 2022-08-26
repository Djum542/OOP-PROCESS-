/**
 * EnumSingleton
 */
public enum EnumSingleton {

    intance;
}
// Intance chỉ được khởi tạo một lần
// Nó còn không thể dùng extends từ một lớp được
// contructor ở đay theo kiểu lười biếng, khi được gọi mới chạy và khởi tạo
// và chỉ chạy duy nhất 1 lần, nêú muốn chạy như eager thì phải đưa vào static block.