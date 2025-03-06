package br.com.senior.chkbackend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCODMOVIMG is a Querydsl query type for CODMOVIMG
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCODMOVIMG extends EntityPathBase<CODMOVIMG> {

    private static final long serialVersionUID = 442227317L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCODMOVIMG cODMOVIMG = new QCODMOVIMG("cODMOVIMG");

    public final StringPath dsDiretorio = createString("dsDiretorio");

    public final StringPath dsNomeArquivo = createString("dsNomeArquivo");

    public final StringPath dsObservacao = createString("dsObservacao");

    public final StringPath dsOrigem = createString("dsOrigem");

    public final StringPath dsUsuario = createString("dsUsuario");

    public final DateTimePath<java.time.LocalDateTime> dtMovimentacao = createDateTime("dtMovimentacao", java.time.LocalDateTime.class);

    public final NumberPath<Integer> inTipoMovimento = createNumber("inTipoMovimento", Integer.class);

    public final QCODMOVIMGId pk;

    public QCODMOVIMG(String variable) {
        this(CODMOVIMG.class, forVariable(variable), INITS);
    }

    public QCODMOVIMG(Path<? extends CODMOVIMG> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCODMOVIMG(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCODMOVIMG(PathMetadata metadata, PathInits inits) {
        this(CODMOVIMG.class, metadata, inits);
    }

    public QCODMOVIMG(Class<? extends CODMOVIMG> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pk = inits.isInitialized("pk") ? new QCODMOVIMGId(forProperty("pk")) : null;
    }

}

