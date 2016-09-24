curl -k -u rw:rw -X POST --header "Content-Type: application/json" --header "Accept: application/json" -d "{
  \"poolId\": \"$1\",
  \"name\": \"vol-fromcurl\",
  \"sizeUnit\": \"gb\",
  \"size\": 30,
  \"segSize\": 128
}" "https://localhost/devmgr/v2/storage-systems/2/volumes"