public class BinaryTreeArray27 {
    Mahasiswa27[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray27() {
        this.dataMahasiswa = new Mahasiswa27[10];
    }

    void populateData (Mahasiswa27 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1); // left child
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2); // right child
            }
        }
    }

    public void add(Mahasiswa27 mhs) {
        if (idxLast < dataMahasiswa.length - 1) {
            dataMahasiswa[++idxLast] = mhs;
        } else {
            System.out.println("Tree penuh");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
          dataMahasiswa[idxStart].tampilInformasi();
          traversePreOrder(2 * idxStart + 1);
          traversePreOrder(2 * idxStart + 2);
        }
    }
}
