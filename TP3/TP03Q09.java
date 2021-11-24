class Serie {
    private String nome;
    private String formato;
    private String duracao;
    private String paisDeOrigem;
    private String idiomaOriginal;
    private String emissoraDeTelevisao;
    private String transmissaoOriginal;
    private int numeroTemporadas;
    private int numeroEpisodio;

    Serie() {
        nome = "";
        formato = "";
        duracao = "";
        paisDeOrigem = "";
        idiomaOriginal = "";
        emissoraDeTelevisao = "";
        transmissaoOriginal = "";
        numeroTemporadas = 0;
        numeroEpisodio = 0;
    }

    Serie(String nome, String formato, String duracao, String paisDeOrigem, String idiomaOriginal,
            String emissoraDeTelevisao, String transmissaoOriginal, int numeroTemporadas, int numeroEpisodio) {
        this.nome = nome;
        this.formato = formato;
        this.duracao = duracao;
        this.paisDeOrigem = paisDeOrigem;
        this.idiomaOriginal = idiomaOriginal;
        this.emissoraDeTelevisao = emissoraDeTelevisao;
        this.transmissaoOriginal = transmissaoOriginal;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodio = numeroEpisodio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return this.formato;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setpaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getpaisDeOrigem() {
        return this.paisDeOrigem;
    }

    public void setidiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getidiomaOriginal() {
        return this.idiomaOriginal;
    }

    public void setemissoraDeTelevisao(String emissoraDeTelevisao) {
        this.emissoraDeTelevisao = emissoraDeTelevisao;
    }

    public String getemissoraDeTelevisao() {
        return this.emissoraDeTelevisao;
    }

    public void settransmissaoOriginal(String transmissaoOriginal) {
        this.transmissaoOriginal = transmissaoOriginal;
    }

    public String gettransmissaoOriginal() {
        return this.transmissaoOriginal;
    }

    public void setnumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getnumeroTemporadas() {
        return this.numeroTemporadas;
    }

    public void setnumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public int getnumeroEpisodio() {
        return this.numeroEpisodio;
    }

    public String extrairFormato(String formato) {
        int i = 0;
        String resp = "";
        for (i = 0; i < formato.length(); i++) {
            if (formato.charAt(i) == '>' && i + 1 < formato.length() && formato.charAt(i + 1) != '<') {
                int j = i + 1;
                while (formato.charAt(j) != '<') {
                    resp += formato.charAt(j);
                    j++;
                }

            }
        }
        return resp;
    }

    public String extrairDuracao(String duracao) {
        int i = 0;
        String resp = "";
        for (i = 0; i < duracao.length(); i++) {
            if (duracao.charAt(i) == '>' && i + 1 < duracao.length() && duracao.charAt(i + 1) != '<') {
                int j = i + 1;
                while (duracao.charAt(j) != '<') {
                    resp += duracao.charAt(j);
                    j++;
                }

            }
        }
        return resp;
    }

    public String extrairNome(String nome) {
        int i = 0;
        String resp = "";
        while (nome.charAt(i) != '.') {
            if (nome.charAt(i) == '_') {
                resp += ' ';
            } else {
                resp += nome.charAt(i);
            }
            i++;
        }
        return resp;
    }

    public String extrairPais(String pais) {
        int i = 0;
        String resp = "";
        for (i = 0; i < pais.length(); i++) {
            if (pais.charAt(i) == '>' && i + 1 < pais.length() && pais.charAt(i + 1) != '<'
                    && pais.charAt(i + 1) != '&') {
                int j = i + 1;
                while (pais.charAt(j) != '<') {
                    resp += pais.charAt(j);
                    j++;
                }

            }
        }
        resp = retirarCaractere(resp);
        return resp;
    }

    public String extrairIdioma(String idioma) {
        int i = 0;
        String resp = "";
        for (i = 0; i < idioma.length(); i++) {
            if (idioma.charAt(i) == '>' && i + 1 < idioma.length() && idioma.charAt(i + 1) != '<') {
                int j = i + 1;
                while (idioma.charAt(j) != '<') {
                    resp += idioma.charAt(j);
                    j++;
                }

            }
        }
        return resp;
    }

    public String extrairEmissora(String emissoraDeTelevisao) {
        int i = 0;
        String resp = "";
        for (i = 0; i < emissoraDeTelevisao.length(); i++) {
            if (emissoraDeTelevisao.charAt(i) == '>' && i + 1 < emissoraDeTelevisao.length()
                    && emissoraDeTelevisao.charAt(i + 1) != '<') {
                i++;
                while (emissoraDeTelevisao.charAt(i) != '<') {
                    resp += emissoraDeTelevisao.charAt(i);
                    i++;
                }

            }
        }
        return resp;
    }

    public String extrairTransmissao(String transmissaoOriginal) {
        int i = 0;
        String resp = "";
        for (i = 0; i < transmissaoOriginal.length(); i++) {
            if (transmissaoOriginal.charAt(i) == '>' && i + 1 < transmissaoOriginal.length()
                    && transmissaoOriginal.charAt(i + 1) != '<') {
                int j = i + 1;
                while (transmissaoOriginal.charAt(j) != '<') {
                    resp += transmissaoOriginal.charAt(j);
                    j++;
                }

            }
        }
        resp = retirarCaractere(resp);
        return resp;
    }

    public int extrairTemporadas(String numeroTemporadas) {
        int i = 0;
        String resp = "";
        for (i = 0; i < numeroTemporadas.length(); i++) {
            if (numeroTemporadas.charAt(i) == '>' && numeroTemporadas.charAt(i + 1) != '<') {
                int j = i + 1;
                while (numeroTemporadas.charAt(j) != '<' && numeroTemporadas.charAt(j) != ' ') {
                    resp += numeroTemporadas.charAt(j);
                    j++;
                }
                i = numeroTemporadas.length();
            }
        }
        int resp2 = Integer.parseInt(resp);
        return resp2;
    }

    public String extrairEpisodios(String numeroEpisodios) {
        int i = 0;
        String resp = "";
        for (i = 0; i < numeroEpisodios.length(); i++) {
            if (numeroEpisodios.charAt(i) == '>' && numeroEpisodios.charAt(i + 1) != '<') {
                int j = i + 1;
                while (numeroEpisodios.charAt(j) != '<' && numeroEpisodios.charAt(j) != ' ') {
                    resp += numeroEpisodios.charAt(j);
                    j++;
                }
                i = numeroEpisodios.length();
            }
        }
        return resp;
    }

    public String retirarCaractere(String retirarCaractere) {
        String resp = "";
        for (int i = 0; i < retirarCaractere.length(); i++) {
            if (retirarCaractere.charAt(i) == '&') {
                i += 6;
            }
            resp += retirarCaractere.charAt(i);
        }
        return resp;
    }

    public void ler(String caminho, String s) throws Exception {
        Arq.openRead(caminho);
        String[] vetorString = new String[4000];
        String linha;
        // System.out.println(Arq.length());
        int i = 0;
        while (Arq.hasNext()) {
            vetorString[i] = Arq.readLine();
            i++;
        }
        i--;
        this.nome = extrairNome(s);
        // System.out.println(nome);
        for (int j = 0; j < i; j++) {
            // System.out.println(vetorString[j]);
            if (vetorString[j].contains(">Formato<") && formato.compareTo("") == 0) {
                // System.out.println(extrairFormato(vetorString[j+1]));
                this.formato = extrairFormato(vetorString[j + 1]);
            } else if (vetorString[j].contains(">Dura") && duracao.compareTo("") == 0) {
                // System.out.println(extrairDuracao(vetorString[j+1]));
                this.duracao = extrairDuracao(vetorString[j + 1]);
            } else if (vetorString[j].contains("s de origem<") && paisDeOrigem.compareTo("") == 0) {
                // System.out.println(extrairPais(vetorString[j+1]));
                this.paisDeOrigem = extrairPais(vetorString[j + 1]).trim();
            } else if (vetorString[j].contains(">Idioma original<")) {
                // System.out.println(extrairIdioma(vetorString[j+1]));
                this.idiomaOriginal = extrairIdioma(vetorString[j + 1]).trim();
            } else if (vetorString[j].contains(">Emissora de televis") && emissoraDeTelevisao.compareTo("") == 0) {
                // System.out.println(extrairEmissora(vetorString[j+1]));
                this.emissoraDeTelevisao = extrairEmissora(vetorString[j + 1]).trim();
            } else if (vetorString[j].contains(">Transmiss") && transmissaoOriginal.compareTo("") == 0) {
                // System.out.println(extrairTransmissao(vetorString[j+1]));
                this.transmissaoOriginal = extrairTransmissao(vetorString[j + 1]).trim();
            } else if (vetorString[j].contains("de temporadas<")) {
                // System.out.println(extrairTemporadas(vetorString[j+1]));
                this.numeroTemporadas = extrairTemporadas(vetorString[j + 1]);
            } else if (vetorString[j].contains("de epis") && numeroEpisodio == 0) {
                // System.out.println(extrairEpisodios(vetorString[j+1]));
                if (extrairEpisodios(vetorString[j + 1]).compareTo("") != 0) {
                    this.numeroEpisodio = Integer.parseInt(extrairEpisodios(vetorString[j + 1]));
                }
            }
        }

    }

    public void imprimir() {
        MyIO.println(nome + " " + formato + " " + duracao + " " + paisDeOrigem + " " + idiomaOriginal + " "
                + emissoraDeTelevisao + " " + transmissaoOriginal + " " + numeroTemporadas + " " + numeroEpisodio);
    }
}

class Lista {
    private Serie listaSerie[];
    private int n;

    Lista(int q) {
        listaSerie = new Serie[q];
        n = 0;
    }

    public void inserirInicio(Serie serie) throws Exception {
        // validar insercao
        if (n >= listaSerie.length) {
            throw new Exception("Erro ao inserir!");
        }

        // levar elementos para o fim do array
        for (int i = n; i > 0; i--) {
            listaSerie[i] = listaSerie[i - 1];
        }

        listaSerie[0] = serie;
        n++;
    }

    public void inserir(Serie serie, int posicao) throws Exception {
        if (n >= listaSerie.length || posicao < 0 || posicao > n) {
            throw new Exception("Erro ao inserir!");
        }

        // levar elementos para o fim do array
        for (int i = n; i > posicao; i--) {
            listaSerie[i] = listaSerie[i - 1];
        }

        listaSerie[posicao] = serie;
        n++;
    }

    public void inserirFim(Serie serie) throws Exception {

        // validar insercao
        if (n >= listaSerie.length) {
            throw new Exception("Erro ao inserir!");
        }

        listaSerie[n] = serie;
        n++;
    }

    public Serie removerInicio(Serie serie) throws Exception {
        // validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        Serie resp = listaSerie[0];
        n--;

        for (int i = 0; i < n; i++) {
            listaSerie[i] = listaSerie[i + 1];
        }

        return resp;
    }

    public Serie remover(Serie serie, int posicao) throws Exception {

        // validar remocao
        if (n == 0 || posicao < 0 || posicao >= n) {
            throw new Exception("Erro ao remover!");
        }

        Serie resp = listaSerie[posicao];
        n--;

        for (int i = posicao; i < n; i++) {
            listaSerie[i] = listaSerie[i + 1];
        }

        return resp;
    }

    public Serie removerFim(Serie serie) throws Exception {

        // validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        return listaSerie[--n];
    }

    public void swap(int x, int y) {
        Serie temp = listaSerie[x];
        listaSerie[x] = listaSerie[y];
        listaSerie[y] = temp;
    }

    public void ordenar() {
        for (int i = 0; i < (n - 1); i++) {
            int menor = i;
            for (int j = (i + 1); j < n; j++) {
                if (listaSerie[menor].getpaisDeOrigem().compareTo(listaSerie[j].getpaisDeOrigem()) > 0) {
                    menor = j;
                }
                if (listaSerie[menor].getpaisDeOrigem().compareTo(listaSerie[j].getpaisDeOrigem()) == 0) {
                    if (listaSerie[menor].getNome().compareTo(listaSerie[j].getNome()) > 0) {
                        menor = j;
                    }
                }
            }
            swap(menor, i);
        }
    }

    public void sort() {
        mergesort(0, n - 1);
    }

    private void mergesort(int esq, int dir) {
        if (esq < dir) {
            int meio = (esq + dir) / 2;
            mergesort(esq, meio);
            mergesort(meio + 1, dir);
            intercalar(esq, meio, dir);
        }
    }

    public void intercalar(int esq, int meio, int dir) {
        int n1, n2, i, j, k;

        // Definir tamanho dos dois subarrays
        n1 = meio - esq + 1;
        n2 = dir - meio;

        Serie[] a1 = new Serie[n1 + 1];
        Serie[] a2 = new Serie[n2 + 1];

        // Inicializar primeiro subarray
        for (i = 0; i < n1; i++) {
            a1[i] = listaSerie[esq + i];
        }

        // Inicializar segundo subarray
        for (j = 0; j < n2; j++) {
            a2[j] = listaSerie[meio + j + 1];
        }

        // Sentinela no final dos dois arrays
        Serie sentinela = new Serie();
        sentinela.setnumeroEpisodio(0x7FFFFFFF);
        a1[i] = a2[j] = sentinela;

        // Intercalacao propriamente dita
        for (i = j = 0, k = esq; k <= dir; k++) {
            listaSerie[k] = (((a1[i].getnumeroEpisodio() < a2[j].getnumeroEpisodio()))||((a1[i].getnumeroEpisodio() == a2[j].getnumeroEpisodio())&&(a1[i].getNome().compareTo(a2[j].getNome()) < 0))) ? a1[i++] : a2[j++];
        }
    }

    public void imprimir() {
        for (int i = 0; i < n; i++) {
            listaSerie[i].imprimir();
        }
    }

}

class TP03Q09 {

    public static boolean isFim(String palavra) {
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I'
                && palavra.charAt(2) == 'M');
    }

    public static boolean pesquisaSequencial(String palavra, Serie array[], int numEntrada) {
        boolean resp = false;
        int n = array.length;

        for (int i = 0; i < numEntrada; i++) {
            if (array[i].getNome().equals(palavra)) {
                resp = true;
                i = n;
            }
        }
        return resp;
    }

    public static String limpaString(String palavra, int inicio) {
        String resp = "";
        for (int i = inicio; i < palavra.length(); i++) {
            resp += palavra.charAt(i);
        }
        return resp;
    }

    public static int extraiPosicao(String s) {
        String posicao = "";
        int i = 0;
        while (i < s.length() && s.charAt(i) != ' ') {
            posicao += s.charAt(i);
            i++;
        }
        int resp = Integer.parseInt(posicao);
        return resp;
    }

    public static void main(String[] args) throws Exception {
        Serie entrada = new Serie();
        int numEntrada = 0;
        String s;
        String caminho;
        int quantidadeDeclaracoes;
        Lista lista = new Lista(100);

        s = MyIO.readLine();
        while (isFim(s) == false) {
            entrada = new Serie();
            caminho = "/tmp/series/" + s;
            entrada.ler(caminho, s);
            lista.inserirFim(entrada);
            numEntrada++;
            s = MyIO.readLine();
        }
        lista.sort();
        lista.imprimir();
    }
}
