{:en {:login-form {:email "E-mail"
                   :password "Password"
                   :heading "Login to InGrower"
                   :admin-heading "Login to InGrower Admin"
                   :required "required"
                   :submit "Login"}

      :icon-nav-bar {:production "Production"
                     :mail "Mail"
                     :account "Account"}

      :loading {:app "Loading InGrower App ..."
                :admin "Loading InGrower Admin ..."
                :database "Connecting to database ..."}

      :save "Save"
      :cancel "Cancel"
      :close "Close"
      :logout "Logout"
      :return-to-app "Return to App"

      :stats {:days-remaining-to-market "Days Remaining to Market"
              :chicks-alive "Chicks Alive"
              :chickens-in-production "Chickens in Production"
              :estimated-revenue "Estimated Revenue"
              :progress-today "Progress Today"
              :start-date "Start Date"
              :days-of-production "Days of Production"
              :revenue "Revenue"
              :chickens-raised "Chickens Raised"
              :chickens-sold "Chickens Sold"}

      :component {:return-to-homepage-button "Return to Homepage"
                  :progress-chart {:dataset "Progress Percentage"}}

      :productions-summary {:title "Active Productions"
                            :delete-dropdown "Delete"
                            :finish-dropdown "Finish"
                            :delete-modal {:title "Delete %s"
                                           :description "Deleting will move this production into the trash bin. Are you sure?"
                                           :submit "I am sure, delete this production"}
                            :finish-modal {:title "Are you finished with %s?"
                                           :description "You will not be able to edit this production's data after you marked it as finished."
                                           :submit "Yes, finish this production"}
                            :panel-no-active-production "Looks like you don't have any active production. Click the button below to start a new production."
                            :start-new-production "Start a new production"}

      :completed-productions {:title "Completed Productions"}

      :new-production-form {:title "Start a new production"
                            :house "House"
                            :test "Test"
                            :date-of-insert "Date of insert of chickens"
                            :number-inserted "Number of chickens inserted"
                            :submit "Begin Production"}

      :production-input-page {:title "Daily Tasks for %s"
                              :accordion {:inputs "Inputs"
                                          :facilities "Facilities"
                                          :management "Management"
                                          :sales-record "Sales Record"}
                              :joyride {:next "Next"
                                        :prev "Prev"
                                        :begin-tour "Begin Tour"
                                        :step-1-welcome "Welcome to your daily production input page. You will use this page to enter your production data every day."
                                        :step-2-date-para1 "This is showing today's date. Which means you are looking at your production information for today."
                                        :step-2-date-para2-a "Later in your production you will see "
                                        :step-2-date-para2-b " and "
                                        :step-2-date-para2-c " icons appear. You can click on them to move backward and forward in time to view a different day's production information."
                                        :step-3-meter "This meter bar shows your progress for this day. Right now it is empty. But you can fill it up by entering data on this page!"
                                        :step-4-saving "Your inputs are continuously saved in the background as you type or select options in these input fields."
                                        :step-5-accordion "Click on any of these headings to open or close a section."
                                        :step-6-sales "When you make a sales, tap here and enter your data in the Sales Record table."
                                        :step-7-done "That's all!"
                                        :finish-button "Finish Tour"}}

      :production-report-page {:title "Production Report for %s"}

      :mail {:to "To"
             :from "From"
             :youve-got-mail-modal {:title "You have (%s) unread %s!"
                                    :message "message"
                                    :messages "messages"
                                    :submit "Open Mailbox"}
             :title "Mailbox (%s)"}

      :message-thread-page {:title "Viewing Message"
                            :reply-textarea-placeholder "Write your reply here."
                            :submit "Send Reply"
                            :return-button "Return to Mailbox"}

      :account-page {:title "Account"
                     :language "Language"
                     :settings "Settings"
                     :history "History"
                     :view-completed-productions "View Completed Productions"
                     :go-to-admin-site "Go to Admin Site"}

      :admin-top-nav-bar {:title "InGrower Administration"
                          :menu "Menu"
                          :mailbox "Mailbox"
                          :my-account "My Account"
                          :productions "Productions"
                          :active "Active"
                          :completed "Completed"}

      :admin-home-page {:active-productions "Active Productions"
                        :heading {:house "House"
                                  :entrepreneur "Entrepreneur"
                                  :progress-history "Progress History"}
                        :not-authorized "You are not authorized to access this section. Please ask your administrator to grant you access."}

      :admin-production-history {:title "Production History: %s by %s"
                                 :today "Today"
                                 :day "Day"
                                 :no-data "There is no data recorded for this production."}

      :admin-edit-history {:title-1 "Editing"
                           :on-date "on %s"
                           :return-to-history "Return to History"}

      :admin-create-user {:full-name "Full Name"
                          :username "Username"
                          :password "Password"
                          :success-message "Account '%s' created."}

      :daily-forms {:kg "kg"
                    :litre "litre"
                    :grams "grams"
                    :doses "doses"
                    :kWh "kWh"
                    :celsius "°C"
                    :percent "%"

                    :feed-a0 "Feed A0"
                    :feed-a1 "Feed A1"
                    :feed-a2 "Feed A2"
                    :water "Water"
                    :sugar "Sugar"
                    :vitamins "Vitamins"
                    :newcastle "Newcastle"
                    :gumboror "Gumboror"
                    :antibiotic "Antibiotic"
                    :electricity-consumption "Electricity Consumption"

                    :house-cleanliness "House Cleanliness"
                    :house-integrity "House Integrity"
                    :feed-trays-cleanliness "Feed Trays Cleanliness"
                    :water-trays-cleanliness "Water Trays Cleanliness"
                    :temperature "Temperature"
                    :humidity "Humidity"

                    :health "Health"
                    :mortality "Mortality"
                    :weight "Weight"

                    :options {:very-dirty "Very Dirty"
                              :dirty "Dirty"
                              :clean "Clean"
                              :very-clean "Very Clean"

                              :very-exposed "Very Exposed"
                              :exposed "Exposed"
                              :tight "Tight"
                              :very-tight "Very Tight"

                              :very-sick "Very Sick"
                              :sick "Sick"
                              :healthy "Healthy"
                              :very-healthy "Very Healthy"}

                    :client-name "Client Name"
                    :number-sold "Units"
                    :price-sold "Total Price (MT)"
                    }

      :missing  "|Missing translation: [%1$s %2$s %3$s]|"}

 ;; -- Portugese ------------

 :pt {:login-form {:email "E-mail"
                   :password "Senha"
                   :heading "Entre para InGrower"
                   :admin-heading "Entre para InGrower Admin"
                   :required "requeridos"
                   :submit "Entrar"}

      :icon-nav-bar {:production "Produção"
                     :mail "Enviar"
                     :account "Conta"}

      :loading {:app "Carregamento InGrower App ..."
                :admin "Carregamento InGrower Admin ..."
                :database "Conectando-se a base de dados ..."}

      :save "Guardar"
      :cancel "Cancelar"
      :close "Fechar"
      :logout "Deslogar"
      :return-to-app "Retornar a App"

      :stats {:days-remaining-to-market "Dias restantes para o Mercado"
              :chicks-alive "Aves Vivas"
              :chickens-in-production "Galinhas em Produção"
              :estimated-revenue "Metical( MT) Não Dólar"
              :progress-today "Progresso Hoje"
              :start-date "Data de Início"
              :days-of-production "Dias de Produção"
              :revenue "Receita"
              :chickens-raised "Galinhas Levantada"
              :chickens-sold "Galinhas Vendido"}

      :component {:return-to-homepage-button "Voltar para Homepage"
                  :progress-chart {:dataset "Percentagem Progresso"}}

      :productions-summary {:title "Produções Ativos"
                            :delete-dropdown "Deletar"
                            :finish-dropdown "Terminar"
                            :delete-modal {:title "Deletar %s"
                                           :description "Excluindo vai mover essa produção para o caixote do lixo. Você tem certeza?"
                                           :submit "Estou certo de que, elimine esta produção"}
                            :finish-modal {:title "Você já terminou com o %s?"
                                           :description "Você não será capaz de editar os dados deste de produção depois que você marcou como terminado."
                                           :submit "Sim, terminar esta produção"}
                            :panel-no-active-production "Parece que você não tem qualquer produção ativa. Clique no botão abaixo para iniciar uma nova produção."
                            :start-new-production "Iniciar uma nova Produção"}

      :completed-productions {:title "Produções Concluídas"}

      :new-production-form {:title "Iniciar uma nova Produção"
                            :house "Pavilhão ou Aviário"
                            :test "Teste"
                            :date-of-insert "Data de Alojamento"
                            :number-inserted "Numero de Aves Alojadas"
                            :submit "Comece Produção"}

      :production-input-page {:title "Tarefas diárias para %s"
                              :accordion {:inputs "Entradas"
                                          :facilities "Facilidades"
                                          :management "Gestão"
                                          :sales-record "Recorde de Vendas"}
                              :joyride {:next "Next"
                                        :prev "Anterior"
                                        :begin-tour "Comece Tour"
                                        :step-1-welcome "Bem-vindo à sua página de entrada produção diária. Você vai usar essa página para inserir seus dados de produção a cada dia."
                                        :step-2-date-para1 "Isto está mostrando a data de hoje. O que significa que você está olhando para a sua informação de produção para hoje."
                                        :step-2-date-para2-a "Mais tarde em sua produção, você verá "
                                        :step-2-date-para2-b " e "
                                        :step-2-date-para2-c " ícones aparecem. Você pode clicar sobre elas para se mover para trás e para frente no tempo para ver as informações de produção um dia diferente de."
                                        :step-3-meter "Este bar medidor mostra o seu progresso para este dia. Agora ele está vazio. Mas você pode preenchê-lo, inserindo dados nesta página!"
                                        :step-4-saving "Suas entradas são continuamente salvo em segundo plano enquanto você digita ou selecione as opções nesses campos de entrada."
                                        :step-5-accordion "Clique em qualquer uma dessas posições para abrir ou fechar uma seção."
                                        :step-6-sales "Quando você faz uma venda, toque aqui e digite seus dados na tabela de vendas de discos."
                                        :step-7-done "Isso é tudo!"
                                        :finish-button "Concluir Tour"}}

      :production-report-page {:title "Relatório de Produção de %s"}

      :mail {:to "Para"
             :from "A partir da"
             :youve-got-mail-modal {:title "Você tem (%s) %s não lidas!"
                                    :message "mensagem"
                                    :messages "mensagens"
                                    :submit "Abra a Caixa Postal"}
             :title "Caixa de correio (%s)"}

      :message-thread-page {:title "Vendo Mensagem"
                            :reply-textarea-placeholder "Escreva sua resposta aqui."
                            :submit "Enviar Responder"
                            :return-button "Retornar à caixa de correio"}

      :account-page {:title "Conta"
                     :language "Idioma"
                     :settings "Configurações"
                     :history "História"
                     :view-completed-productions "Veja Concluído Productions"
                     :go-to-admin-site "Ir para a Administração do Site"}

      :admin-top-nav-bar {:title "InGrower Administração"
                          :menu "Cardápio"
                          :mailbox "Caixa de correio"
                          :my-account "A minha conta"
                          :productions "Produções"
                          :active "Ativo"
                          :completed "Completo"}

      :admin-home-page {:active-productions "Produções Ativos"
                        :heading {:house "Casa"
                                  :entrepreneur "Empresário"
                                  :progress-history "Histórico Progresso"}
                        :not-authorized "Você não está autorizado a aceder a esta secção. Por favor, pergunte ao seu administrador para lhe conceder acesso."}

      :admin-production-history {:title "História Produção: %s por %s"
                                 :today "Hoje"
                                 :day "Dia"
                                 :no-data "Não há dados gravados para essa produção."}

      :admin-edit-history {:title-1 "Edição de"
                           :on-date "em %s"
                           :return-to-history "Voltar para História"}

      :admin-create-user {:full-name "Nome Completo"
                          :username "Nome de Usuário"
                          :password "Senha"
                          :success-message "Conta '%s' criado."}

      :daily-forms {:kg "kg"
                    :litre "litre"
                    :grams "em gramas"
                    :doses "dosis"
                    :kWh "kWh"
                    :celsius "°C"
                    :percent "%"

                    :feed-a0 "Ração A0"
                    :feed-a1 "Ração A1"
                    :feed-a2 "Ração A2"
                    :water "Água"
                    :sugar "Açúcar"
                    :vitamins "Vitaminas"
                    :newcastle "Newcastle"
                    :gumboror "Gumboror"
                    :antibiotic "Antibióticos"
                    :electricity-consumption "Consumo de Eletricidade"

                    :house-cleanliness "Estado do Aviário ou Pavilhão"
                    :house-integrity "Espaço Vital no Aviário"
                    :feed-trays-cleanliness "Estado dos Comedouros"
                    :water-trays-cleanliness "Estado dos Bebedouros"
                    :temperature "Temperatura"
                    :humidity "Umidade"

                    :health "Sanidade das Aves."
                    :mortality "Mortalidade"
                    :weight "Peso"

                    :options {:very-dirty "Muito Sujo"
                              :dirty "Sujo"
                              :clean "Limpo"
                              :very-clean "Muito Limpo"

                              :very-exposed "Muito Exposto"
                              :exposed "Exposto"
                              :tight "Apertado"
                              :very-tight "Muito Apertado"

                              :very-sick "Muito Doente"
                              :sick "Doente"
                              :healthy "Sadio"
                              :very-healthy "Muito Sadio"}

                    :client-name "Nome do Cliente"
                    :number-sold "Unidades"
                    :price-sold "Preço Total (MT)"}

      :missing "|Faltando Tradução: [%1$s %2$s %3$s]|"}
 }
