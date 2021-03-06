
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

/** CUP generated class containing symbol constants. */
public class Symb {
  /* terminals */
  public static final int B_XV = 95;
  public static final int menos = 47;
  public static final int menor = 41;
  public static final int uint_SC = 18;
  public static final int porcentaje = 52;
  public static final int B_X = 90;
  public static final int B_XII = 92;
  public static final int B_V = 85;
  public static final int bytes = 13;
  public static final int B_XI = 91;
  public static final int menos_igual = 54;
  public static final int punto = 57;
  public static final int pragma = 2;
  public static final int B_VII = 87;
  public static final int C_Parent_R = 51;
  public static final int B_I = 81;
  public static final int C_Parent_L = 7;
  public static final int address_payable = 29;
  public static final int B_XIIX = 98;
  public static final int B_XXIIX = 108;
  public static final int ident = 77;
  public static final int privateSoli = 33;
  public static final int C_Parent_C = 31;
  public static final int div = 48;
  public static final int menor_igual = 40;
  public static final int intSoli = 21;
  public static final int techo = 4;
  public static final int uint_CVO = 19;
  public static final int int_DS = 23;
  public static final int mas = 46;
  public static final int B_XIII = 93;
  public static final int internalSoli = 72;
  public static final int uint_DCS = 20;
  public static final int B_XXIII = 103;
  public static final int numero_HEX = 79;
  public static final int forSoli = 63;
  public static final int continueSoli = 62;
  public static final int falseSoli = 36;
  public static final int mayor_igual = 38;
  public static final int op_and = 44;
  public static final int doSoli = 64;
  public static final int uint = 14;
  public static final int B_XXXI = 111;
  public static final int elseSoli = 66;
  public static final int string = 75;
  public static final int uint_DS = 16;
  public static final int B_VI = 86;
  public static final int payableSoli = 71;
  public static final int op_or = 43;
  public static final int B_IX = 89;
  public static final int B_IIX = 88;
  public static final int B_IV = 84;
  public static final int O_Parent_R = 50;
  public static final int O_Parent_L = 6;
  public static final int bool = 11;
  public static final int B_II = 82;
  public static final int div_igual = 56;
  public static final int B_III = 83;
  public static final int charss = 74;
  public static final int O_Parent_C = 30;
  public static final int B_XXX = 110;
  public static final int B_XXV = 105;
  public static final int returnSoli = 60;
  public static final int igual_igual = 37;
  public static final int returns = 73;
  public static final int mayor = 39;
  public static final int int_CVO = 26;
  public static final int int_O = 22;
  public static final int B_XXI = 101;
  public static final int mas_igual = 53;
  public static final int int_DCS = 27;
  public static final int breakSoli = 61;
  public static final int EOF = 0;
  public static final int trueSoli = 35;
  public static final int structSoli = 69;
  public static final int B_XXVI = 106;
  public static final int por_igual = 55;
  public static final int B_XXIX = 109;
  public static final int B_XXIV = 104;
  public static final int numero = 78;
  public static final int int_TD = 24;
  public static final int interrogacion_C = 67;
  public static final int error = 1;
  public static final int ifSoli = 65;
  public static final int enumSoli = 8;
  public static final int byteSoli = 12;
  public static final int B_XXII = 102;
  public static final int B_XXXII = 112;
  public static final int diferente = 42;
  public static final int negacion = 45;
  public static final int functionSoli = 70;
  public static final int solidity = 3;
  public static final int ufixedSoli = 76;
  public static final int B_XVII = 97;
  public static final int B_XXVII = 107;
  public static final int uint_TD = 17;
  public static final int por = 49;
  public static final int int_SC = 25;
  public static final int uint_O = 15;
  public static final int punto_punto = 68;
  public static final int thisSoli = 58;
  public static final int publicSoli = 32;
  public static final int coma = 10;
  public static final int igual = 34;
  public static final int B_XVI = 96;
  public static final int whileSoli = 59;
  public static final int punto_coma = 9;
  public static final int B_XIX = 99;
  public static final int stringSoli = 80;
  public static final int contract = 5;
  public static final int B_XIV = 94;
  public static final int address = 28;
  public static final int B_XX = 100;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "pragma",
  "solidity",
  "techo",
  "contract",
  "O_Parent_L",
  "C_Parent_L",
  "enumSoli",
  "punto_coma",
  "coma",
  "bool",
  "byteSoli",
  "bytes",
  "uint",
  "uint_O",
  "uint_DS",
  "uint_TD",
  "uint_SC",
  "uint_CVO",
  "uint_DCS",
  "intSoli",
  "int_O",
  "int_DS",
  "int_TD",
  "int_SC",
  "int_CVO",
  "int_DCS",
  "address",
  "address_payable",
  "O_Parent_C",
  "C_Parent_C",
  "publicSoli",
  "privateSoli",
  "igual",
  "trueSoli",
  "falseSoli",
  "igual_igual",
  "mayor_igual",
  "mayor",
  "menor_igual",
  "menor",
  "diferente",
  "op_or",
  "op_and",
  "negacion",
  "mas",
  "menos",
  "div",
  "por",
  "O_Parent_R",
  "C_Parent_R",
  "porcentaje",
  "mas_igual",
  "menos_igual",
  "por_igual",
  "div_igual",
  "punto",
  "thisSoli",
  "whileSoli",
  "returnSoli",
  "breakSoli",
  "continueSoli",
  "forSoli",
  "doSoli",
  "ifSoli",
  "elseSoli",
  "interrogacion_C",
  "punto_punto",
  "structSoli",
  "functionSoli",
  "payableSoli",
  "internalSoli",
  "returns",
  "charss",
  "string",
  "ufixedSoli",
  "ident",
  "numero",
  "numero_HEX",
  "stringSoli",
  "B_I",
  "B_II",
  "B_III",
  "B_IV",
  "B_V",
  "B_VI",
  "B_VII",
  "B_IIX",
  "B_IX",
  "B_X",
  "B_XI",
  "B_XII",
  "B_XIII",
  "B_XIV",
  "B_XV",
  "B_XVI",
  "B_XVII",
  "B_XIIX",
  "B_XIX",
  "B_XX",
  "B_XXI",
  "B_XXII",
  "B_XXIII",
  "B_XXIV",
  "B_XXV",
  "B_XXVI",
  "B_XXVII",
  "B_XXIIX",
  "B_XXIX",
  "B_XXX",
  "B_XXXI",
  "B_XXXII"
  };
}

