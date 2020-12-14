package lab1129;
public class Cryptography {
	public static void main(String[] args) {
		String s11 = new String ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");	
		String s21 = new String ("PQEYNBISKATHCUZRDOFLJGMVXW");
		String s1 = s11.toLowerCase();	
		String s2 = s21.toLowerCase();
		String s = new String ("p apgp roziopc cjfl spgn zun zo czon ehpffnf lsn upcn zb lsn fzjoen bkhn puy lsn upcn zb lsn ehpff cjfl qn lsn fpcn kb mn mpul cptn p apgp roziopc nvnejlpqhn mn cjfl rozgkyn p cpku cnlszy lsn cpku cnlszy kf pu kuykeplzo puy p fkiupljon bzo apgp gkoljph cpeskun lz bkuy lsn nulox rzkul zb lsn roziopc bzo nvnejlkzu");
		int count = 0 ;
        char get ;//用来获取对应顺序的字符，从0到最后一个，用count
        char trans1; //用来获取需要翻译的字符
        int input ; //用于得到需要解码的字符的下标索引    
        while (count <= (s.length()-1)) {
        	get = s.charAt(count);
        	if(get !=' ') {
        		input = s2.indexOf(get);//得到对应的密码文的字符在解码表s2的下标索引
        		trans1 =s1.charAt(input);
        		System.out.print((trans1));
        	}else System.out.print(get);
        	count ++ ;}}};