package one.app.mappers;

import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueCheckStrategy;

@MapperConfig(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface Config {
}
