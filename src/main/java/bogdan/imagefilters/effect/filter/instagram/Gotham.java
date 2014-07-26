package bogdan.imagefilters.effect.filter.instagram;

import bogdan.imagefilters.effect.filter.AbstractFilter;
import bogdan.imagefilters.effect.util.Pixel;

public class Gotham extends AbstractFilter {

	private static final int[][] kRGBMap = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10,11,11,12,12,12,13,13,13,14,14,15,15,16,17,17,18,19,19,20,21,21,22,23,23,24,25,26,26,27,28,29,30,31,32,33,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,57,58,59,60,62,63,64,65,67,68,69,70,72,73,74,75,77,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,131,132,133,134,135,137,138,139,140,141,143,144,145,146,147,148,150,151,152,153,154,156,157,158,159,160,162,163,165,167,168,170,172,173,175,177,178,180,182,183,185,187,189,191,193,195,197,199,201,203,205,207,209,211,213,215,217,219,221,223,225,227,229,231,233,235,238,240,242,244,246,248,250,252},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,13,13,14,14,15,15,16,17,17,18,18,19,19,20,21,21,22,22,23,24,24,25,26,26,27,27,28,29,29,30,31,31,32,33,34,35,35,36,37,38,39,39,40,41,42,43,44,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,66,67,68,69,70,72,73,74,75,76,78,79,80,82,83,84,86,87,89,90,91,93,94,95,97,98,100,101,103,104,106,107,109,110,112,113,115,116,118,119,121,122,124,125,127,129,131,132,134,136,138,139,141,143,145,146,148,150,152,153,155,157,159,161,163,165,167,169,171,173,175,177,179,181,183,184,185,187,188,189,191,192,194,195,196,198,199,200,202,203,205,206,208,209,211,212,214,215,217,219,220,222,223,225,226,228,230,231,233,234,236,237,239,240,242,244,245,247,248,250,251,253},
			{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,2,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,10,10,10,11,11,11,12,12,13,13,13,14,14,15,15,16,16,16,17,17,18,18,19,19,20,20,20,21,21,22,22,23,23,23,24,24,25,25,26,26,27,27,28,28,29,29,30,30,31,31,32,32,33,33,34,34,35,35,36,36,37,37,38,38,39,40,40,41,41,42,42,43,44,44,45,45,46,46,47,47,48,49,49,50,50,51,51,52,53,54,55,56,57,58,60,61,62,63,64,66,67,68,69,70,72,73,74,76,77,79,80,82,83,84,86,87,89,90,92,93,95,96,98,99,101,102,104,105,107,109,110,112,113,115,116,118,120,121,123,125,127,129,131,133,135,137,139,141,143,145,147,149,151,153,155,157,159,161,163,165,168,170,172,174,176,178,180,182,185,186,187,189,190,191,193,194,196,197,198,200,201,202,204,205,207,208,209,211,212,214,215,217,218,219,221,222,224,225,227,228,230,231,233,234,236,237,239,240,242,244,245,247,248,250,251,253}
		};
	
	@Override
	public Pixel process(Pixel rgba) {
		
		rgba.setR( kRGBMap[0][rgba.getR()] );
		rgba.setG( kRGBMap[1][rgba.getG()] );
		rgba.setB( kRGBMap[2][rgba.getB()] );
		
		return rgba;
	}

}