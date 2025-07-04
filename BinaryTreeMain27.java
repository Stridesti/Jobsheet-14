public class BinaryTreeMain27 {
    public static void main(String[] args) {
        BinaryTree27 bst = new BinaryTree27();

        bst.add(new Mahasiswa27("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa27("244160220", "Dewi", "B", 3.54));
        bst.add(new Mahasiswa27("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa27("244160221", "Badar", "B", 3.85));

        System.out.println("\nDaftar semua mahasiswa (in Order traversal):");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan IPK: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK: 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa27("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa27("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa27("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("PreOrder Traversal:");  
        bst.traversePreOrder(bst.root);
        System.out.println("PostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nMahasiswa dengan IPK paling kecil:");
        bst.cariMinIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK paling besar:");
        bst.cariMaxIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);

        System.out.println("\nMenambahkan mahasiswa menggunakan addRekursif():");
        bst.addRekursif(new Mahasiswa27("244160223", "Dela", "A", 3.78));
        bst.traverseInOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa:");
        bst.delete(3.57);
        System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal) :");
        bst.traverseInOrder(bst.root);
    }
}
