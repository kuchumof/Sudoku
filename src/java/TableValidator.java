public class TableValidator {
    /**
     * ������� ����
     * 1. ����� � ������ �� ���. � ����. �� ������ ����������� �.�.
     * ���� ����������� ����� �� �����������/��������� � ����
     * ����������� �������, �� ��� ����� ������ ���� �����������;
     * 2. ����� � ����� �������� �� ������ �����������;
     * 3. ���-�� ����� � �������� ����� 9.
     */

    /**
     * ����� ��� �������� ������������� � ������������ ����� � ��������� �������
     *
     * @param table ������� ���� �.�. ����� �� ��������� � �����������,�������������� � ���� ���������� �������;
     * @return ������������ ���� � ������.
     */
    public static boolean checkTable(int[][] table) {
        int[] line = new int[table.length];// ���������� ������ ��� ���������� �������� ��������.
        //��������� ���� �� �������
        for (int i = 0; i < table.length; i++) {
            /*��������� ���������� ����, ����� ������ �� �������������� ������ � ���������� ��������
             �� ��������� ������ line ��� ���������� �������� ����� ����� checkLine */
            for (int j = 0; j < table.length; j++) {
                line[j] = table[i][j]; // �������� �� �����������
            }
            if (!checkLine(line)) {
                return false;
            }
        }
        //��������� ���� �� ��������
        for (int i = 0; i < table.length; i++) {
            /*��������� ���������� ����, ����� ������ �� ��������� ����� � ���������� ��������
             �� ��������� ������ line ��� ���������� �������� ����� ����� checkLine */
            for (int j = 0; j < table.length; j++) {
                line[j] = table[j][i];// �������� �� ���������
            }
            if (!checkLine(line)) {
                return false;
            }
        }
        return true;
    }

    /**
     * ����� ��������� ����� �� ���������� ��������
     * 1. ��������� ������ ���� for (int i = 0) ��� ���� ����� ������ �������� ���������� � � � ����������
     * ���������� � �� ����� ���������� �������� �� ��������� ����� for (int j = i+1);
     * �������� �� ������� �������� �� ������� (i< ����� �������); ���������� ���� �� ����� (i++);
     * 2. ����� ������ ��-� ������� (������ ��� �� ��������� ���������� �)
     * 3. ���������� � � ��-�� ������� ������� �� ������� (i=1).
     * 3.1 ��������� ��������� ���� for (int j = i+1);
     * �������� �� ������� �������� �� ������� (j< ����� �������); ���������� ���� �� ����� (j++);
     * 3.2 ��������� �������� �������� if ���������� � � ������� ��-��� �������;
     * 3.3 ���� �������� ���������, ����� ��������� ���� for � ������� ��������� false (��� ������, ��� ����� �� ���������);
     * 3.4 ���� ������ ����� for ���� ��������� � ���������� �� �������, �� ������� � ���������� �������� �������;
     * 3.5 ���� �������� �� ��������� �� ���� ��������� ������� �����, ������� ��������� true (��� ������, ��� ����� ���������);
     *
     * @param line ����� �� �����������/���������, �������������� � ���� ����������� �������;
     * @return ������������ ���� � �����.
     */
    private static boolean checkLine(int[] line) {
        for (int i = 0; i < line.length; i++) { //
            int k = line[i];
            for (int j = i + 1; j < line.length; j++) {
                if (k == line[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
