package lab1129;
public class Cryptography {
	public static void main(String[] args) {
		String s11 = new String ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");	
		String s21 = new String ("PQEYNBISKATHCUZRDOFLJGMVXW");
		String s1 = s11.toLowerCase();	
		String s2 = s21.toLowerCase();
		String s = new String ("p apgp roziopc cjfl spgn zun zo czon ehpffnf lsn upcn zb lsn fzjoen bkhn puy lsn upcn zb lsn ehpff cjfl qn lsn fpcn kb mn mpul cptn p apgp roziopc nvnejlpqhn mn cjfl rozgkyn p cpku cnlszy lsn cpku cnlszy kf pu kuykeplzo puy p fkiupljon bzo apgp gkoljph cpeskun lz bkuy lsn nulox rzkul zb lsn roziopc bzo nvnejlkzu");
		int count = 0 ;
        char get ;//������ȡ��Ӧ˳����ַ�����0�����һ������count
        char trans1; //������ȡ��Ҫ������ַ�
        int input ; //���ڵõ���Ҫ������ַ����±�����    
        while (count <= (s.length()-1)) {
        	get = s.charAt(count);
        	if(get !=' ') {
        		input = s2.indexOf(get);//�õ���Ӧ�������ĵ��ַ��ڽ����s2���±�����
        		trans1 =s1.charAt(input);
        		System.out.print((trans1));
        	}else System.out.print(get);
        	count ++ ;}}};