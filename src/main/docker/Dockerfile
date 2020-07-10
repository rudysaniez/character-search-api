FROM openjdk:11-jre


COPY /maven/*.jar /usr/src/me/
COPY /maven/bin/character-search-api /usr/bin/character-search-api

RUN chmod 0755 /usr/bin/character-search-api && \
    mkdir /etc/me/ && \
    useradd -M me -u 42

#COPY /maven/certificates/*.crt /usr/local/share/ca-certificates/
#RUN update-ca-certificates
# import certificates for the JVM
#RUN for certif in $( ls /usr/local/share/ca-certificates/*.crt ) ; do keytool -import -storepass changeit -noprompt -cacerts -trustcacerts -file $certif -alias ${certif%%.*} ; done

WORKDIR /etc/me/

USER 42 
CMD ["character-search-api"]

VOLUME [ "/etc/me/" ]
EXPOSE 8080
